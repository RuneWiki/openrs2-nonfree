import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class224 {

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "[I")
	public int[] anIntArray545 = new int[20];

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "I")
	public final int anInt6900;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString263;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "I")
	public final int anInt6901;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString264;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray48;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class224(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt6900 = arg3;
		this.aString263 = arg1;
		this.anInt6901 = arg4;
		this.aString264 = arg0;
		this.anIntArray545 = arg5;
		this.aStringArray48 = arg2;
	}
}
