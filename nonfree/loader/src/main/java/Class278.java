import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!c")
public final class Class278 {

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "[I")
	public int[] anIntArray630 = new int[20];

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray38;

	@OriginalMember(owner = "loader!c", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString84;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "I")
	public final int anInt8022;

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString83;

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "I")
	public final int anInt8023;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class278(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray630 = arg5;
		this.aStringArray38 = arg2;
		this.aString84 = arg1;
		this.anInt8022 = arg3;
		this.aString83 = arg0;
		this.anInt8023 = arg4;
	}
}
