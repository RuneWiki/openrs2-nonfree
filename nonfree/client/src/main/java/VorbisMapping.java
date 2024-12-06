import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class80 {

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	public final int anInt3106;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public int anInt3107;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
	public final int[] anIntArray342;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
	public final int[] anIntArray341;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class80() {
		Static77.method1296(16);
		this.anInt3106 = Static77.method1289() == 0 ? 1 : Static77.method1296(4) + 1;
		if (Static77.method1289() != 0) {
			Static77.method1296(8);
		}
		Static77.method1296(2);
		if (this.anInt3106 > 1) {
			this.anInt3107 = Static77.method1296(4);
		}
		this.anIntArray342 = new int[this.anInt3106];
		this.anIntArray341 = new int[this.anInt3106];
		for (@Pc(42) int local42 = 0; local42 < this.anInt3106; local42++) {
			Static77.method1296(8);
			this.anIntArray342[local42] = Static77.method1296(8);
			this.anIntArray341[local42] = Static77.method1296(8);
		}
	}
}
