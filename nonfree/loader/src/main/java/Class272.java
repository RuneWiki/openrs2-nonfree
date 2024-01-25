import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class272 {

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "[I")
	public int[] anIntArray501 = new int[20];

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "I")
	public final int anInt7458;

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "I")
	public final int anInt7459;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray57;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString72;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString73;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class272(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt7458 = arg4;
		this.anInt7459 = arg3;
		this.aStringArray57 = arg2;
		this.anIntArray501 = arg5;
		this.aString72 = arg0;
		this.aString73 = arg1;
	}
}
