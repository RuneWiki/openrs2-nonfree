import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!h")
public final class Class397 {

	@OriginalMember(owner = "loader!h", name = "e", descriptor = "[I")
	public int[] anIntArray623 = new int[20];

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString130;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "I")
	public final int anInt10684;

	@OriginalMember(owner = "loader!h", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray45;

	@OriginalMember(owner = "loader!h", name = "d", descriptor = "I")
	public final int anInt10685;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString131;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class397(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString130 = arg0;
		this.anInt10684 = arg3;
		this.aStringArray45 = arg2;
		this.anInt10685 = arg4;
		this.anIntArray623 = arg5;
		this.aString131 = arg1;
	}
}
