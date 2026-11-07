# kotlin-katas

Daily algorithmic practice in **Kotlin**. One problem, one idiom, one commit at a time.

Part of a broader learning rhythm covering both JVM (Kotlin) and .NET (C#) ecosystems — see the companion repo [csharp-katas](../csharp-katas).

---

## 🎯 Why this exists

Modern backend engineering demands fluency across:
- **Core data structures** (arrays, maps, linked lists, trees, heaps, graphs)
- **Algorithmic patterns** (sliding window, two pointers, DP, greedy, backtracking)
- **Idiomatic language use** — not just "code that works" but "code a senior engineer would ship"

This repo is a disciplined, long-running practice log. Each solution:
- Narrates the problem in plain English
- States the approach + trade-offs before the code
- Uses **idiomatic Kotlin** (collection stdlib, scope functions, null-safety, sealed classes, data classes)
- Has at least one test
- Includes time + space complexity

---

## 📁 Structure

```
src/main/kotlin/
├── week01_arrays_hashmaps/        ← Week 1: fundamentals
├── week02_linkedlists_stacks/     ← Week 2: pointer patterns
├── week03_trees_graphs/           ← Week 3: tree traversal + BFS/DFS
├── week04_recursion_dp/           ← Week 4: dynamic programming
├── week05_sliding_window/         ← Week 5: window patterns
├── week06_heaps/                  ← Week 6: priority queues
├── week07_backtracking/           ← Week 7: backtracking
└── week08_concurrency/            ← Week 8: coroutines + thread-safe
```

Tests mirror the structure under `src/test/kotlin/`.

---

## 📋 Progress

### Week 1 — Arrays, Strings, Hash Maps ✅
- [x] 1. Two Sum
- [x] 344. Reverse String
- [x] 217. Contains Duplicate
- [x] 242. Valid Anagram
- [x] 49. Group Anagrams
- [x] 3. Longest Substring Without Repeating Characters
- [x] 347. Top K Frequent Elements

### Week 2 — Linked Lists, Stacks, Queues 🚧
- [x] 206. Reverse Linked List
- [x] 21. Merge Two Sorted Lists
- [x] 141. Linked List Cycle
- [x] 20. Valid Parentheses
- [x] 232. Implement Queue using Stacks
- [ ] 739. Daily Temperatures
- [ ] 150. Evaluate Reverse Polish Notation

### Week 3 — Trees + Graphs ⬜
- [ ] 226. Invert Binary Tree
- [ ] 104. Maximum Depth of Binary Tree
- [ ] 543. Diameter of Binary Tree
- [ ] 100. Same Tree
- [ ] 572. Subtree of Another Tree
- [ ] 102. Binary Tree Level Order Traversal
- [ ] 200. Number of Islands
- [ ] 133. Clone Graph

*(Updated weekly)*

---

## 🏃 Run locally

### Prerequisites
- JDK 17+ (or JDK 21 LTS recommended)
- Gradle (wrapper included)

### Build
```bash
./gradlew build
```

### Run tests
```bash
./gradlew test
```

### Run tests for a specific week
```bash
./gradlew test --tests "week01_arrays_hashmaps.*"
```

---

## 📝 How each solution is structured

Every solution file follows this pattern:

```kotlin
package week01_arrays_hashmaps

/*
 * Problem: 1. Two Sum (LeetCode)
 *
 * Statement:
 *   Given an array of integers `nums` and a target, return the indices of two
 *   numbers that sum to target. Exactly one solution exists. You may not use
 *   the same element twice.
 *
 * Approach:
 *   One-pass hash map. For each number x, check if (target - x) is already in
 *   the map. If yes, we found the pair. If no, add x -> index to the map.
 *
 * Complexity:
 *   Time: O(n) — single pass
 *   Space: O(n) — hash map in worst case
 *
 * Trade-off:
 *   Brute force O(n²) uses no extra space. Hash map O(n)/O(n) is strictly
 *   better for interview context where time matters more than memory.
 */
class P0001TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()
        for ((i, x) in nums.withIndex()) {
            val complement = target - x
            if (complement in seen) {
                return intArrayOf(seen[complement]!!, i)
            }
            seen[x] = i
        }
        error("no solution found")
    }
}
```

---

## 🧠 Kotlin idioms demonstrated

Over the full corpus, these recur:

| Idiom | Where |
|---|---|
| `groupBy { } / groupingBy { }.eachCount()` | Frequency problems, anagram groups |
| `sortedBy { } / sortedByDescending { } / sortedWith(compareBy...)` | Sort + ranking problems |
| `associateBy { } / toMap()` | Lookup indexing |
| `fold { } / runningFold { }` | Running state, accumulation |
| `windowed(k) / zipWithNext()` | Window + pairwise comparisons |
| `mapNotNull { } / filterIsInstance<T>()` | Safe collection transforms |
| `sealed class` + `when` | State machines, explicit result types |
| `data class` + `copy()` | Immutable updates |
| `ArrayDeque` as stack / queue | Linked-list and BFS problems |
| `PriorityQueue<T>(compareBy...)` | Top-K, scheduling |

---

## 🎓 About the author

**Shardar Rahman** — Senior Software Engineer and Technical Lead with 15 years' experience, 7 of those in UK FCA-regulated fintech (Mortgage Magic). Focus: Java, Kotlin, C#, Spring Boot, DDD, event-driven architectures.

- GitHub: [@hafiz5007](https://github.com/hafiz5007)
- LinkedIn: [hafizrahmanuk](https://linkedin.com/in/hafizrahmanuk)

---

## 📜 License

MIT. See [LICENSE](LICENSE).
