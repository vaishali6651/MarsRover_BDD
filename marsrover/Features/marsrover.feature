Feature: Feature to test Rover orientation

  @tag2
  Scenario Outline: Positioning of the Rover
    Given <Rover> is ready for orientation in Platue
    When I Set the X co-ordinate to <X>
    And I Set the Y co-ordinate to <Y>
    And I Set the direction to <Facing>
    And Move the rover to specific direction "<position>"
    Then Verify the Final position of the <Rover>

    Examples: 
      | Rover  | X | Y | Facing | position  |
      | Rover1 | 1 | 2 | 1      | LMLMLMLMM |
      | Rover2 | 3 | 3 | 2      | MMRMMRMRRM|