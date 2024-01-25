import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class272 {

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "[I")
	public int[] anIntArray585 = new int[20];

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString99;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "I")
	public final int anInt7802;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public final int anInt7803;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString98;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray46;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class272(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString99 = arg1;
		this.anInt7802 = arg3;
		this.anInt7803 = arg4;
		this.aString98 = arg0;
		this.anIntArray585 = arg5;
		this.aStringArray46 = arg2;
	}
}
