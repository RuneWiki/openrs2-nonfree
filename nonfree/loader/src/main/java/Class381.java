import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class381 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "[I")
	public int[] anIntArray757 = new int[20];

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public final int anInt10300;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray48;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString121;

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "I")
	public final int anInt10301;

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString120;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class381(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10300 = arg3;
		this.aStringArray48 = arg2;
		this.anIntArray757 = arg5;
		this.aString121 = arg1;
		this.anInt10301 = arg4;
		this.aString120 = arg0;
	}
}
