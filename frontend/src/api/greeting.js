import Vue from 'vue'
// Документация к vue-resource
// https://github.com/pagekit/vue-resource/blob/develop/docs/http.md
const  worlds = Vue.resource('/greeting{/id}');

export default  {
    remove: id => worlds.remove({id: id} ),
    allWorlds: page => Vue.http.get('/greeting', {params: { page }})
}