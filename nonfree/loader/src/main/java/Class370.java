import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class370 {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "[I")
	public int[] anIntArray635 = new int[20];

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "I")
	public final int anInt9827;

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString119;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "I")
	public final int anInt9828;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray44;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString118;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class370(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt9827 = arg3;
		this.aString119 = arg0;
		this.anInt9828 = arg4;
		this.aStringArray44 = arg2;
		this.aString118 = arg1;
		this.anIntArray635 = arg5;
	}
}
