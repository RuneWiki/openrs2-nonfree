import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class382 {

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "[I")
	public int[] anIntArray702 = new int[20];

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "I")
	public final int anInt10387;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString111;

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray50;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString112;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "I")
	public final int anInt10386;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class382(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10387 = arg4;
		this.aString111 = arg1;
		this.anIntArray702 = arg5;
		this.aStringArray50 = arg2;
		this.aString112 = arg0;
		this.anInt10386 = arg3;
	}
}
