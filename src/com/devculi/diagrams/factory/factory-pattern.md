Requirements:
1. Follow the diagram-factory, implement the code
2. The zoo want to check ability of each animal
3. The veterinarian want to check health of fish
  - Condition:
    + Weight >=100 && <=999  -> OK
    + Otherwise, not OK


*** Solve1
1. What's problems the factory pattern solved?
 1.1 What's happened when the zoo want check ability of the peacock(Con cong)?
  - Create a class Peacock and extends from class Bird
  - Implement its ability
  - At class Zoo, we new class Peacock and invoke its method
  ==> Have to change the code at class Zoo - Change 1 class
  1.2 What happened when we use ZooFactory method?
  - The zoo class won't care how build any animal. Therefore, focus how check ability of each animals and switch that responsibility to ZooFactory class.
  1.3 Do we still modify code at Zoo class? Right?
  - Yes! We do. It make me confuse. :3
  - With case  use ZooFactory, if the zoo want to check ability of other animal. We have to change code at ZooFactory(new a other animal) and change code at Zoo class as well (get this animal by name and invoke its ability)  ==> Change 2 class.

??What happened when a other zoo also want to collect animals and check their abilities(for example: Zoo at HoChiMinh)



2. How to implement the factory pattern?
3.


***Solid principle
CLOSE FOR MODIFICATION AND OPEN FOR EXTENSION