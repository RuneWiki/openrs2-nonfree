import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class386 {

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "[I")
	public int[] anIntArray748 = new int[20];

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray54;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	public final int anInt10499;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString124;

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "I")
	public final int anInt10500;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString125;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class386(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray748 = arg5;
		this.aStringArray54 = arg2;
		this.anInt10499 = arg3;
		this.aString124 = arg0;
		this.anInt10500 = arg4;
		this.aString125 = arg1;
	}
}
