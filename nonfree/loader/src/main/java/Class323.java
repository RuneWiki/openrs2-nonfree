import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class323 {

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "[I")
	public int[] anIntArray732 = new int[20];

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public final int anInt9183;

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray40;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString94;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString95;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	public final int anInt9182;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class323(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt9183 = arg4;
		this.aStringArray40 = arg2;
		this.aString94 = arg1;
		this.aString95 = arg0;
		this.anIntArray732 = arg5;
		this.anInt9182 = arg3;
	}
}
