import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class384 {

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "[I")
	public int[] anIntArray574 = new int[20];

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString129;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray41;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "I")
	public final int anInt10790;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString128;

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "I")
	public final int anInt10789;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class384(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString129 = arg0;
		this.aStringArray41 = arg2;
		this.anIntArray574 = arg5;
		this.anInt10790 = arg3;
		this.aString128 = arg1;
		this.anInt10789 = arg4;
	}
}
