import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class385 {

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "[I")
	public int[] anIntArray651 = new int[20];

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString120;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString119;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "I")
	public final int anInt10768;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "I")
	public final int anInt10767;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray77;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class385(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString120 = arg0;
		this.anIntArray651 = arg5;
		this.aString119 = arg1;
		this.anInt10768 = arg3;
		this.anInt10767 = arg4;
		this.aStringArray77 = arg2;
	}
}
