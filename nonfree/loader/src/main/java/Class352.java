import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class352 {

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "[I")
	public int[] anIntArray851 = new int[20];

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray51;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString118;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString119;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "I")
	public final int anInt9891;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "I")
	public final int anInt9890;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class352(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray51 = arg2;
		this.anIntArray851 = arg5;
		this.aString118 = arg0;
		this.aString119 = arg1;
		this.anInt9891 = arg3;
		this.anInt9890 = arg4;
	}
}
