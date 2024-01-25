import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class389 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "[I")
	public int[] anIntArray849 = new int[20];

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "I")
	public final int anInt10513;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray48;

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString160;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString159;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public final int anInt10512;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class389(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10513 = arg4;
		this.aStringArray48 = arg2;
		this.aString160 = arg0;
		this.aString159 = arg1;
		this.anInt10512 = arg3;
		this.anIntArray849 = arg5;
	}
}
