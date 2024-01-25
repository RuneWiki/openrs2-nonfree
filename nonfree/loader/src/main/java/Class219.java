import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class219 {

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "[I")
	public int[] anIntArray648 = new int[20];

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray69;

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "I")
	public final int anInt6849;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "I")
	public final int anInt6850;

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString68;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class219(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray69 = arg2;
		this.anInt6849 = arg3;
		this.anInt6850 = arg4;
		this.anIntArray648 = arg5;
		this.aString68 = arg1;
		this.aString67 = arg0;
	}
}
