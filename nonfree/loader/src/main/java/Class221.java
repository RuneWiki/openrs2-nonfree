import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class221 {

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "[I")
	public int[] anIntArray551 = new int[20];

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "I")
	public final int anInt6790;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "I")
	public final int anInt6789;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray53;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class221(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString67 = arg1;
		this.aString66 = arg0;
		this.anInt6790 = arg4;
		this.anIntArray551 = arg5;
		this.anInt6789 = arg3;
		this.aStringArray53 = arg2;
	}
}
