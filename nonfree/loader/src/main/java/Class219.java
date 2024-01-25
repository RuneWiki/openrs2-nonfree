import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!c")
public final class Class219 {

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "[I")
	public int[] anIntArray517 = new int[20];

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "I")
	public final int anInt6824;

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray88;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "I")
	public final int anInt6823;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "loader!c", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString68;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class219(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray517 = arg5;
		this.anInt6824 = arg4;
		this.aStringArray88 = arg2;
		this.anInt6823 = arg3;
		this.aString67 = arg1;
		this.aString68 = arg0;
	}
}
