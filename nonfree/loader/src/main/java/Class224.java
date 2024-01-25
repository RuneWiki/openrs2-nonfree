import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class224 {

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "[I")
	public int[] anIntArray567 = new int[20];

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray46;

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "I")
	public final int anInt6629;

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString392;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString391;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "I")
	public final int anInt6628;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class224(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray46 = arg2;
		this.anIntArray567 = arg5;
		this.anInt6629 = arg3;
		this.aString392 = arg1;
		this.aString391 = arg0;
		this.anInt6628 = arg4;
	}
}
