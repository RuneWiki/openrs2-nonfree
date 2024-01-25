import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class270 {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "[I")
	public int[] anIntArray588 = new int[20];

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray178;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "I")
	public final int anInt7694;

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString68;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "I")
	public final int anInt7693;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class270(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray178 = arg2;
		this.aString67 = arg1;
		this.anIntArray588 = arg5;
		this.anInt7694 = arg3;
		this.aString68 = arg0;
		this.anInt7693 = arg4;
	}
}
