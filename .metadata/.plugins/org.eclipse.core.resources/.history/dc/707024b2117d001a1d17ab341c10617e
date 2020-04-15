'''
Created on 9 abr. 2020
  
@author: Knut Waale

'''
dic = {'12/04/20': [('09:00', 'pasea al perro'), ('10:00', 'jode a gaby'), ('09:30', 'hace arepa con mantequilla'), ('10:00', 'va el caiman, se va el caiman'), ('09:00', 'pasea al loco')], '13/04/20': [('09:00', 'pasea al perro'), ('10:00', 'jodea a gaby'), ('09:30', 'hace arepa con mantequilla'), ('10:00', 'va el caiman, se va el caiman'), ('09:00', 'pasea al loco')], '14/04/20': [('09:00', 'pasea al perro'), ('10:00', 'jodea a gaby'), ('09:30', 'hace arepa con mantequilla'), ('10:00', 'va el caiman, se va el caiman'), ('09:00', 'pasea al loco')]}

def cargarDatos():
    agenda = {}
    lista = []
    continua1 = "s"
    continua2 = "s"
    while continua1 == "s":
        fecha = input("Ingresa la fecha en formato DD/MM/AA: ")
        continua2 = input("Desea continuar? [s/n]: ")
        while continua2 == "s":
            hora = input("Ingresa la hora en formato hh:mm: ")
            actividad = input("Ingresa la actividad: ")
            lista.append((hora, actividad))
            
            continua2 = input("Desea continuar con la misma fecha? [s/n]: ")
        
        continua1 = input("Desea continuar? [s/n]: ")
        agenda[fecha] = lista
        
    return agenda
def imprimirAgenda(agenda):
    for fecha in agenda:
        print("Para la fecha: ", fecha)
        for hora,actividad in dic[fecha]:
            print("A las ", hora, " se ", actividad)

def consultaFechaAgenda(agenda):
    fecha = input("Fecha de consulta: ")
    if fecha in agenda:
        for hora,actividad in agenda[fecha]:
            print("A las ", hora, " se ", actividad)
    else:
        print("No hay resultado para la consulta")
        

agendaTrabajo = dic
imprimirAgenda(agendaTrabajo)
consultaFechaAgenda(dic)
