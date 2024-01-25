import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class324 {

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "[I")
	public int[] anIntArray850 = new int[20];

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString81;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public final int anInt9171;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "I")
	public final int anInt9170;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString82;

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray46;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class324(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString81 = arg1;
		this.anInt9171 = arg4;
		this.anIntArray850 = arg5;
		this.anInt9170 = arg3;
		this.aString82 = arg0;
		this.aStringArray46 = arg2;
	}
}
