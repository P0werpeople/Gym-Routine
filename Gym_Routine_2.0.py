import random

class GymRoutine:
    #Printing
    def printing(self, hits):
        i = 0
        print("The hits for today are:")
        while i < len(hits):
            print(hits[i])
            i += 1
        
    #Random Choosing for Routines
    def add_hits(self, list):
        hits = []
        i = 0
        while i < 6:
            add_hit = random.choice(list)
            hits.insert(i, add_hit)
            list.remove(add_hit)
            i += 1
        return hits

    #Leg Routine set up
    def legs(self):
        legs_list = ['Back Squat', 'Conventional Deadlift', 'Sumo Deadkift', 'Leg Press', 'Romanian deadlift(DB)', "Split Squat",
        "Leg Extension", "Lying Hamstring Curls", 'Cafe Raise']
        hits = self.add_hits(legs_list)
        return hits

    #Push Routine Set up
    def push(self):
        push_list = ['Bench Press', 'Overhead Press', 'Incline DB Press', 'DB Lateral Raise', 'DB Chest Flyers', 
        'Barbell Tricep Extensions', 'Rope Tricep Extensions', 'Cable Crossover']
        hits = self.add_hits(push_list)
        return hits

    #Pull Routine Set Up
    def pull(self):
        pull_list = ['Deadlift', 'BB Row', 'Lat Pulldown', 'DB Row', 'Face Pull', 'BB Curl', 'Preacher Curl', 'Skull Crushers', 
        'Shurgs', 'Cable Curls', 'Seated Rows']
        hits = self.add_hits(pull_list)
        return hits

    def main(self):
        try:
            choice = int(input("What do you want to hit today: 1 - Legs, 2 - Push (Chest), 3 - Pull (Back)? "))
            while choice > 3 or choice < 1:
                choice = int(input("Please enter a valid number. 1 - Legs, 2 - Push (Chest), 3 - Pull (Back)? "))
            if choice == 1:
                legday = self.legs()
                self.printing(legday)
            elif choice == 2:
                pushday = self.push()
                self.printing(pushday)
            elif choice == 3:
                pullday = self.pull()
                self.printing(pullday)
        except ValueError & UnboundLocalError & TypeError:
            choice = int(input("Please enter a valid number. 1 - Legs, 2 - Push, 3 - Pull"))
        
if __name__ == '__main__':
    GymRoutine().main()