import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class412 {

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "[I")
	public int[] anIntArray804 = new int[20];

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString144;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "I")
	public final int anInt11275;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray45;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "I")
	public final int anInt11274;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString143;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class412(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray804 = arg5;
		this.aString144 = arg0;
		this.anInt11275 = arg4;
		this.aStringArray45 = arg2;
		this.anInt11274 = arg3;
		this.aString143 = arg1;
	}
}
