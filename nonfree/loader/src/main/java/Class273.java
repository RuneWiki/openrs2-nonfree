import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class273 {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "[I")
	public int[] anIntArray522 = new int[20];

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "I")
	public final int anInt7552;

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "I")
	public final int anInt7551;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray49;

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString78;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class273(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt7552 = arg3;
		this.anIntArray522 = arg5;
		this.aString77 = arg1;
		this.anInt7551 = arg4;
		this.aStringArray49 = arg2;
		this.aString78 = arg0;
	}
}
