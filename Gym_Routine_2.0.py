import random

class GymRoutine:
    def legs(self):
        legs_list = ['Back Squat', 'Conventional Deadlift', 'Sumo Deadkift', 'Leg Press', 'Romanian deadlift(DB)', "Split Squat",
        "Leg Extension", "Lying Hamstring Curls", 'Cafe Raise']
        legs_hit = []
        i = 0
        while i < 6:
            legs_hit.insert(i, random.choice(legs_list))
            i += 1
        return legs_hit
    def main(self):
        choice = int(input("What do you want to hit today: 1 - Legs, 2 - Push, 3 - Pull?"))
        if choice == 1:
            legday = self.legs()
            print(legday)
        
if __name__ == '__main__':
    GymRoutine().main()