<template>
  <el-dropdown trigger="click" class='international' @command="handleSetLanguage">
    <div>
      <!-- <svg-icon class-name='international-icon' icon-class="language" /> -->
      {{$t('navbar.languageSwitch')}}
    </div>
    <el-dropdown-menu slot="dropdown">
      <el-dropdown-item command="zh" :disabled="language==='zh'">中文</el-dropdown-item>
      <el-dropdown-item command="en" :disabled="language==='en'">English</el-dropdown-item>
    </el-dropdown-menu>
  </el-dropdown>
</template>

<script>
  import {global} from '../../../global/global'

  export default {
    computed: {
      language() {
        var lang = localStorage.getItem('lang');
        if (!lang) {
          lang = 'zh';
        }
        return lang;
      }
    },
    methods: {
      handleSetLanguage(lang) {
        global.changeLanguage(lang);
        this.$i18n.locale = lang;
        this.$message({
          message: 'switch language success',
          type: 'success'
        });
      }
    }
  }
</script>

<style scoped>
  .international-icon {
    font-size: 22px;
    cursor: pointer;
    vertical-align: -5px !important;
  }

  .el-dropdown {
    color: white;
  }
</style>


