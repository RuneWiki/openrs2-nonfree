import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class204 {

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "[I")
	public int[] anIntArray624 = new int[20];

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "I")
	public int anInt6247;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "Ljava/lang/String;")
	public String aString204;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "I")
	public int anInt6246;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	public String aString203;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray39;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class204(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt6247 = arg3;
		this.aString204 = arg0;
		this.anInt6246 = arg4;
		this.aString203 = arg1;
		this.aStringArray39 = arg2;
		this.anIntArray624 = arg5;
	}
}
