import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class258 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!ul;[Lclient!fk;)V")
	public dxVertexLayout(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) Class118[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aGca1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class118 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local27 < local25.method2808(); local27++) {
				@Pc(41) Class371 local41 = local25.method2809(local27);
				if (Static622.aClass371_1 == local41) {
					local7.addElement(local11, 2, 0, 0, 0, local21);
				} else if (local41 == Static622.aClass371_2) {
					local7.addElement(local11, 2, 0, 3, 0, local21);
				} else if (Static622.aClass371_3 == local41) {
					local7.addElement(local11, 4, 0, 10, 0, local21);
				} else if (local41 == Static622.aClass371_4) {
					local7.addElement(local11, 0, 0, 5, local9++, local21);
				} else if (Static622.aClass371_5 == local41) {
					local7.addElement(local11, 1, 0, 5, local9++, local21);
				} else if (local41 == Static622.aClass371_6) {
					local7.addElement(local11, 2, 0, 5, local9++, local21);
				} else if (Static622.aClass371_7 == local41) {
					local7.addElement(local11, 3, 0, 5, local9++, local21);
				}
				local21 += local41.anInt10157;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, (IDirect3DVertexDeclaration) null);
	}
}
