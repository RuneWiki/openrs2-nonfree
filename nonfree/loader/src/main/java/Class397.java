import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class397 {

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "[I")
	public int[] anIntArray833 = new int[20];

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "I")
	public final int anInt11226;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray49;

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "I")
	public final int anInt11227;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString122;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString121;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class397(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt11226 = arg4;
		this.anIntArray833 = arg5;
		this.aStringArray49 = arg2;
		this.anInt11227 = arg3;
		this.aString122 = arg1;
		this.aString121 = arg0;
	}
}
