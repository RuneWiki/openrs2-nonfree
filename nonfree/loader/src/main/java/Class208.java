import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class208 {

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "[I")
	public int[] anIntArray529 = new int[20];

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	public int anInt6229;

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "Ljava/lang/String;")
	public String aString304;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public int anInt6230;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray39;

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "Ljava/lang/String;")
	public String aString305;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class208(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt6229 = arg4;
		this.anIntArray529 = arg5;
		this.aString304 = arg1;
		this.anInt6230 = arg3;
		this.aStringArray39 = arg2;
		this.aString305 = arg0;
	}
}
