import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class204 {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "[I")
	public int[] anIntArray500 = new int[20];

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/String;")
	public String aString204;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray86;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "I")
	public int anInt5736;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "I")
	public int anInt5735;

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "Ljava/lang/String;")
	public String aString205;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class204(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString204 = arg1;
		this.aStringArray86 = arg2;
		this.anIntArray500 = arg5;
		this.anInt5736 = arg3;
		this.anInt5735 = arg4;
		this.aString205 = arg0;
	}
}
