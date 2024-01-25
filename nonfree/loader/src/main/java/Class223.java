import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class223 {

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "[I")
	public int[] anIntArray725 = new int[20];

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "I")
	public final int anInt6409;

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString310;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "I")
	public final int anInt6410;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray46;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString309;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class223(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray725 = arg5;
		this.anInt6409 = arg4;
		this.aString310 = arg1;
		this.anInt6410 = arg3;
		this.aStringArray46 = arg2;
		this.aString309 = arg0;
	}
}
