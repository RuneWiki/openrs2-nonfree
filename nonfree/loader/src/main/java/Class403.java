import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class403 {

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "[I")
	public int[] anIntArray609 = new int[20];

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString128;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString129;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray53;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "I")
	public final int anInt11222;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "I")
	public final int anInt11221;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class403(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray609 = arg5;
		this.aString128 = arg0;
		this.aString129 = arg1;
		this.aStringArray53 = arg2;
		this.anInt11222 = arg4;
		this.anInt11221 = arg3;
	}
}
