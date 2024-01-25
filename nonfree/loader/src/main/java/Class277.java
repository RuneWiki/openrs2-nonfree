import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class277 {

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "[I")
	public int[] anIntArray531 = new int[20];

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString80;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public final int anInt7839;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "I")
	public final int anInt7840;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString81;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray50;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class277(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString80 = arg0;
		this.anIntArray531 = arg5;
		this.anInt7839 = arg3;
		this.anInt7840 = arg4;
		this.aString81 = arg1;
		this.aStringArray50 = arg2;
	}
}
