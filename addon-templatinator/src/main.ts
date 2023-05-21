import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import './theme/global.scss'
import './theme/theme.scss'

createApp(App).use(router).mount('#app')
