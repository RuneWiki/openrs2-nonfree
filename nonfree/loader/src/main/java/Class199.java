import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class199 {

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "[I")
	public int[] anIntArray605 = new int[20];

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/lang/String;")
	public String aString210;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public int anInt6093;

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "I")
	public int anInt6094;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	public String aString211;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray47;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class199(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString210 = arg0;
		this.anInt6093 = arg3;
		this.anInt6094 = arg4;
		this.aString211 = arg1;
		this.aStringArray47 = arg2;
		this.anIntArray605 = arg5;
	}
}
