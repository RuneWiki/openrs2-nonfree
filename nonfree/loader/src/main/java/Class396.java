import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class396 {

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "[I")
	public int[] anIntArray633 = new int[20];

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString130;

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray71;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "I")
	public final int anInt10964;

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString131;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "I")
	public final int anInt10965;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class396(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString130 = arg1;
		this.aStringArray71 = arg2;
		this.anInt10964 = arg4;
		this.aString131 = arg0;
		this.anInt10965 = arg3;
		this.anIntArray633 = arg5;
	}
}
