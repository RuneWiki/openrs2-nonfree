import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class396 {

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "[I")
	public int[] anIntArray625 = new int[20];

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "I")
	public final int anInt10844;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "I")
	public final int anInt10843;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray75;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString150;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString151;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class396(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10844 = arg4;
		this.anInt10843 = arg3;
		this.aStringArray75 = arg2;
		this.aString150 = arg0;
		this.anIntArray625 = arg5;
		this.aString151 = arg1;
	}
}
