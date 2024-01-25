import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class355 {

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "[I")
	public int[] anIntArray731 = new int[20];

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray42;

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "I")
	public final int anInt10006;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	public final int anInt10005;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString97;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString98;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class355(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray42 = arg2;
		this.anInt10006 = arg3;
		this.anInt10005 = arg4;
		this.aString97 = arg1;
		this.aString98 = arg0;
		this.anIntArray731 = arg5;
	}
}
