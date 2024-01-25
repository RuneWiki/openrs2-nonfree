import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class271 {

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "[I")
	public int[] anIntArray677 = new int[20];

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString72;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray46;

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString73;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "I")
	public final int anInt7618;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "I")
	public final int anInt7619;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class271(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString72 = arg1;
		this.aStringArray46 = arg2;
		this.aString73 = arg0;
		this.anIntArray677 = arg5;
		this.anInt7618 = arg4;
		this.anInt7619 = arg3;
	}
}
