import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class34 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "h", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!sga;[Lclient!im;)V")
	public dxVertexLayout(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) Class168[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aDba1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class168 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local25.method3648() > local27; local27++) {
				@Pc(41) Class116 local41 = local25.method3644(local27);
				if (local41 == Static174.aClass116_1) {
					local7.addElement(local11, 2, 0, 0, 0, local21);
				} else if (local41 == Static174.aClass116_2) {
					local7.addElement(local11, 2, 0, 3, 0, local21);
				} else if (Static174.aClass116_3 == local41) {
					local7.addElement(local11, 4, 0, 10, 0, local21);
				} else if (local41 == Static174.aClass116_4) {
					local7.addElement(local11, 0, 0, 5, local9++, local21);
				} else if (Static174.aClass116_5 == local41) {
					local7.addElement(local11, 1, 0, 5, local9++, local21);
				} else if (local41 == Static174.aClass116_6) {
					local7.addElement(local11, 2, 0, 5, local9++, local21);
				} else if (local41 == Static174.aClass116_7) {
					local7.addElement(local11, 3, 0, 5, local9++, local21);
				}
				local21 += local41.anInt2905;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, (IDirect3DVertexDeclaration) null);
	}
}
