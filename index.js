const report = require('multiple-cucumber-html-reporter');
var fecha= new Date();
var hora_actual = fecha.getHours() + ":" + fecha.getMinutes()

report.generate({
	jsonDir: 'src/test/resources/reportes/',
	reportPath: 'src/test/resources/reportes/',
	openReportInBrowser: true,
	metadata:{
        browser: {
            name: 'chrome',
            version: '60'
        },
        device: 'Sistema local',
        platform: {
            name: 'JAVA',
            version: '8'
        }
    },
    customData: {
        title: 'Informacion de ejecucion',
        data: [
            {label: 'Prueba:', value: 'Proyecto final obligatorio - automatizacion de pruebas de software - 2022'},
            {label: 'Autor:', value: 'Christiams Sena'},
            {label: 'Instituto', value: 'BIOS - Escuela de sistemas'},
            {label: 'Hora de ejecucion', value: hora_actual},
            {label: 'Hora de finalizacion', value: hora_actual}
        ]
    }
});