import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!c")
public final class Class274 {

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "[I")
	public int[] anIntArray753 = new int[20];

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString68;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "I")
	public final int anInt7973;

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray46;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "I")
	public final int anInt7974;

	@OriginalMember(owner = "loader!c", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString69;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class274(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray753 = arg5;
		this.aString68 = arg1;
		this.anInt7973 = arg3;
		this.aStringArray46 = arg2;
		this.anInt7974 = arg4;
		this.aString69 = arg0;
	}
}
