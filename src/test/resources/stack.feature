Feature: I need a stack!
  As a noob
  I need to be able to store stuff in a stack
  So that I can demonstrate awesome things in a stack
  So that I can make more money!

  Background:
    Given an empty stack

  Scenario: Push an item into a stack
    When I push an item into the stack
    Then the stack contains one item

  Scenario: Push two items into a stack
    When I push an item into the stack
    And I push another item into the stack
    Then the stack contains two items

  Scenario: Pop a given item from the stack
    When I push an item into the stack
    And I pop from the stack
    Then I get the same item back

  Scenario Outline: Push a string into the stack and get it back
    When I push a string "<blarg>" into the stack
    Then the stack contains one Item
    When I pop the string from the stack
    Then my string is "<blarg>"
  Examples:
    | blarg                  |
    | a string               |
    | another string hooray! |