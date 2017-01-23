//Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
// <script src="https://gist.github.com/arpan-ghosh/61901a6a4fb189cfa932ed9ff4936bff.js"></script>

//LeetCode exercise FindComplement
//fastest way to solve it

public class FastComplement {
    public int complement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}
