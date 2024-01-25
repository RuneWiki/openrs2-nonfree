import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class382 {

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "[I")
	public int[] anIntArray609 = new int[20];

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString110;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "I")
	public final int anInt10670;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	public final int anInt10669;

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray81;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString109;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class382(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString110 = arg0;
		this.anInt10670 = arg3;
		this.anInt10669 = arg4;
		this.aStringArray81 = arg2;
		this.aString109 = arg1;
		this.anIntArray609 = arg5;
	}
}
