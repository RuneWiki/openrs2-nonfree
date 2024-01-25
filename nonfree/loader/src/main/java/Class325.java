import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class325 {

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "[I")
	public int[] anIntArray825 = new int[20];

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "I")
	public final int anInt9485;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "I")
	public final int anInt9484;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray49;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString87;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class325(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt9485 = arg3;
		this.anInt9484 = arg4;
		this.anIntArray825 = arg5;
		this.aStringArray49 = arg2;
		this.aString86 = arg0;
		this.aString87 = arg1;
	}
}
