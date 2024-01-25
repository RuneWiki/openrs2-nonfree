import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class368 {

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "[I")
	public int[] anIntArray592 = new int[20];

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "I")
	public final int anInt10611;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray42;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString243;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString244;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "I")
	public final int anInt10612;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class368(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10611 = arg4;
		this.aStringArray42 = arg2;
		this.aString243 = arg1;
		this.aString244 = arg0;
		this.anInt10612 = arg3;
		this.anIntArray592 = arg5;
	}
}
