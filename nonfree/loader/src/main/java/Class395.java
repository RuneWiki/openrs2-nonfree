import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class395 {

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "[I")
	public int[] anIntArray604 = new int[20];

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString136;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString135;

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "I")
	public final int anInt11457;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray83;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "I")
	public final int anInt11458;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class395(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray604 = arg5;
		this.aString136 = arg1;
		this.aString135 = arg0;
		this.anInt11457 = arg3;
		this.aStringArray83 = arg2;
		this.anInt11458 = arg4;
	}
}
